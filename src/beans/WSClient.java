package beans;

 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.glassfish.jersey.client.ClientConfig;
//import org.glassfish.jersey.media.multipart.FormDataMultiPart;
//import org.glassfish.jersey.media.multipart.MultiPartFeature;
//import org.glassfish.jersey.media.multipart.file.FileDataBodyPart;;

/**
 *
 * @author gina PC
 */
public class WSClient {
    private Client client;
    private String RS_URL = "http://localhost:8080/PanBox-1.0/webresources/panbox";
    
    public void init() {
        ClientConfig cf = new ClientConfig();
        cf.register(JsonMoxyConfigurationContextResolver.class);
        client = ClientBuilder.newClient(cf);
    }
    
    public static void main(String[] args) {
        try {
            WSClient wsc = new WSClient();
            wsc.init();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /*
    public void addStckPurOrder( ArrayList<StckPurOrd> stckpurods ){
      for(int i = 0; i <= stckpurods.size(); i++){
          numdata.add(model.getValueAt(count, 1).toString());

      }
      System.out.println(numdata); 
    }
    */
    
    
    public Integer stockFinder( String name ){
        int count = 0;
        int stockNo = 0;
        boolean condition = false;
        ArrayList<Stock> stocks = stockList();
        while(condition!=true){
            if(name.equals(stocks.get(count).getStockName())){
                condition = true;
            }
            count++;
        }
        return count;
    }
    //returns arraylist<StckParticularPurOrd> containing values of stckparticularpurord
    public ArrayList<StckParticularPurOrd> getStckParticularPurOrd( int id ){
        StckParticularPurOrdList list = client.target(RS_URL)
                .path("/stckparticularpurord/" + String.valueOf(id) )
                .request(MediaType.APPLICATION_JSON)
                .get(StckParticularPurOrdList.class);
        ArrayList<StckParticularPurOrd> sppList = list.getList();
        return sppList;
    }
    
    public void updateStckQty( Stock s ){
        String message = client.target(RS_URL)
                .path("/updateStckQty" )
                .request(MediaType.APPLICATION_JSON)
                .post(Entity.entity(s, MediaType.APPLICATION_XML), String.class);
    }
    
    public void updateStckParticularPurOrd( StckParticularPurOrd spp){
        String stckparticular = client.target(RS_URL)
                .path("/updateStckParticularPurOrd")
                .request(MediaType.APPLICATION_JSON)
                .post(Entity.entity(spp, MediaType.APPLICATION_XML), String.class);
    }
    
    public int getStock( String sname ){
        Stock stock = client.target(RS_URL)
                .path("/stock/"+ sname)
                .request(MediaType.APPLICATION_JSON)
                .get(Stock.class);
        //System.out.println(stock.getId());
        return stock.getId();
    }
    /*
    public ArrayList<PurchaseOrder> getPoList( int id ){
        PurchaseOrderList list = client.target(RS_URL)
                .path("/purchaseOrder/"+ String.valueOf(id))
                .request(MediaType.APPLICATION_JSON)
                .get(PurchaseOrderList.class);
        ArrayList<PurchaseOrder> poList = list.getList();
        return poList;
    }
    */        
    public int getSupp( String name ){
        Supplier supplier = client.target(RS_URL)
                .path("/supplier/"+ name)
                .request(MediaType.APPLICATION_JSON)
                .get(Supplier.class);
        return supplier.getId();
    }
    
    public ArrayList<StckParticular> getStckParticular( String supname ){
        StckParticularList spList = client.target(RS_URL)
                .path("/stckparticulars/"+ supname)
                .request(MediaType.APPLICATION_JSON)
                .get(StckParticularList.class);
        ArrayList<StckParticular> list = spList.getList();
        return list;
    }
    
    public StckParticular getStckParticularFromName( String particularname ){
        StckParticular sp = client.target(RS_URL)
                .path("/stckparticular/" + particularname )
                .request(MediaType.APPLICATION_JSON)
                .get(StckParticular.class);
        return sp;
    }
    
    public void addstckparticularord( StckParticularPurOrd sppo ){
        StckParticularPurOrd stckparticular = client.target(RS_URL)
                .path("/addstckparticularpurord")
                .request(MediaType.APPLICATION_JSON)
                .post(Entity.entity(sppo, MediaType.APPLICATION_XML), StckParticularPurOrd.class);
    }
    
    public ArrayList<Employee> getEmployeeList(){
        EmployeeList sp = client.target(RS_URL)
                .path("/employees" )
                .request(MediaType.APPLICATION_JSON)
                .get(EmployeeList.class);
        ArrayList<Employee> list = sp.getList();
        return list;
    }
    
    public int addPurOrd( String datetime ){
        PurchaseOrder spo = client.target(RS_URL)
                .path("/addpurchaseorder")
                .request(MediaType.APPLICATION_JSON)
                .post(Entity.entity(datetime, MediaType.APPLICATION_XML), PurchaseOrder.class);
        return spo.getPoid();
    }
    
    public void updateStckPurOrd( StckPurOrd spo ){
        StckPurOrd stckpurord = client.target(RS_URL)
                .path("/updateStckPurOrd")
                .request(MediaType.APPLICATION_JSON)
                .post(Entity.entity(spo, MediaType.APPLICATION_XML), StckPurOrd.class);
    }
    
    public void addStckPurOrd( StckPurOrd spo ){
        StckPurOrd stckpurord = client.target(RS_URL)
                .path("/addstckpurord")
                .request(MediaType.APPLICATION_JSON)
                .post(Entity.entity(spo, MediaType.APPLICATION_XML), StckPurOrd.class);
        //System.out.println(stckpurord.getPoid());
    }
    
    public ArrayList<PurchaseOrder> purchaseOrderList(){
        PurchaseOrderList list = client.target(RS_URL)
                .path("/purchaseOrders")
                .request(MediaType.APPLICATION_JSON)
                .get(PurchaseOrderList.class);
        ArrayList<PurchaseOrder> poList = list.getList();
        return poList;
    }

    public ArrayList<Transaction> purchaseOrderList(int prodid){
        TransactionList list = client.target(RS_URL)
                .path("/orderhistory/"+ String.valueOf(prodid))
                .request(MediaType.APPLICATION_JSON)
                .get(TransactionList.class);
        ArrayList<Transaction> tList = list.getList();
        return tList;   
    }
    
    public ArrayList<Supplier> supplierOrderList(){
        SupplierList list = client.target(RS_URL)
                .path("/suppliers")
                .request(MediaType.APPLICATION_JSON)
                .get(SupplierList.class);
        ArrayList<Supplier> sList = list.getList();
        return sList;   
    }
    
    public ArrayList<User> userList(){
        UserList list = client.target(RS_URL)
                .path("/users")
                .request(MediaType.APPLICATION_JSON)
                .get(UserList.class);
        ArrayList<User> userList = list.getList();
        return userList;   
    }
    
    public ArrayList<Product> productList(){
        ProdList list = client.target(RS_URL)
                .path("/products")
                .request(MediaType.APPLICATION_JSON)
                .get(ProdList.class);
        ArrayList<Product> plist = list.getList();
        return plist;
    }
    
    public HashMap billofmat(String prodname){
    BillOfMat bm = client.target(RS_URL)
                .path("/billofmat/"+ prodname)
                .request(MediaType.APPLICATION_JSON)
                .get(BillOfMat.class);
        HashMap<String, Integer> bill = bm.getMaterials();
        return bill;
    }
    
    public ArrayList<Order> orderList(){
        OrderList list = client.target(RS_URL)
                .path("/orders/finished")
                .request(MediaType.APPLICATION_JSON)
                .get(OrderList.class);
        ArrayList<Order> tList = list.getList();
        return tList;
    }
    
    public ArrayList<Stock> stockList(){
        StockList list = client.target(RS_URL)
                .path("/stocks")
                .request(MediaType.APPLICATION_JSON)
                .get(StockList.class);
        ArrayList<Stock> sList = list.getList();
        return sList;
    }
    /*
        public void testImageUpload() throws IOException {
            final Client client = ClientBuilder.newBuilder().register(MultiPartFeature.class).build();
            final FileDataBodyPart filePart = new FileDataBodyPart("pimage", new File("D:/Untitled.png"));
            FormDataMultiPart formDataMultiPart = new FormDataMultiPart();
            final FormDataMultiPart multipart = (FormDataMultiPart) formDataMultiPart.field("pid", "200").bodyPart(filePart);
            final WebTarget target = client.target("http://192.168.1.37:8080/PanBox-1.0/webresources/panbox/upload");
            final Response response = target.request().post(Entity.entity(multipart, multipart.getMediaType()));
            formDataMultiPart.close();
            multipart.close();
        }
    */
}