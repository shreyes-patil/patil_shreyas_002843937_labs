///*
// * To change this template, choose Tools | Templates
// * and open the template in the editor.
// */

package model;

import javax.swing.ImageIcon;

import model.ProductCatalog;

//import model.ProductCatalog;

/**
 *
 * @author shrey
 */
public class Supplier {
    
    private String supplyName;
    private ProductCatalog productCatalog;
    private ImageIcon logoImage;

    public ImageIcon getLogoImage() {
        return logoImage;
    }

    public void setLogoImage(ImageIcon logoImage) {
        this.logoImage = logoImage;
    }
    
    public Supplier() {
        productCatalog = new ProductCatalog();
    }

    public String getSupplyName() {
        return supplyName;
    }

    public void setSupplyName(String supplyName) {
        this.supplyName = supplyName;
    }

    public ProductCatalog getProductCatalog() {
        return productCatalog;
    }
    
    public Product findProductById(int productId) {
        for (Product product : productCatalog.getProductCatalog()) {
            if (product.getId() == productId) {
                return product; 
            }
        }
        return null; 
    }
    
    @Override
    public String toString() {
        return supplyName;
    }
    
}
