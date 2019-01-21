package nopcommerce;


public class HomePage extends Utils{

       public void openHomePage(){
            LoadProp loadProp = new LoadProp();
            driver.get(loadProp.getProperty("URL"));
    }

}
