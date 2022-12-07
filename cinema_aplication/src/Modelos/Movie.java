package Modelos;

/**
 *
 * @author Lenovo
 */
public class Movie {
    private String name;
    private int productionYear;
    private String type;

    public Movie() {
    }

    public Movie(String name, int productionYear, String type) {
        this.name = name;
        this.productionYear = productionYear;
        this.type = type;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the productionYear
     */
    public int getProductionYear() {
        return productionYear;
    }

    /**
     * @param productionYear the productionYear to set
     */
    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    /**
     * @return the type
     */
    public String getTip() {
        return type;
    }

    /**
     * @param tip the type to set
     */
    public void setTip(String tip) {
        this.type = tip;
    }
    
    
}
