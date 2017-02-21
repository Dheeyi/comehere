package aes.example.comehere.Models;

/**
 * Created by alex enrique on 20/2/2017.
 */

public class Bank {

    private String name;
    private Integer iconLogo;
    private String addressCentral;

    /**
     * Contructor default
     */
    public Bank () {}

    /**
     * Constructor Bank
     * @param name
     * @param iconLogo
     * @param addressCentral
     */
    public Bank(String name, Integer iconLogo, String addressCentral) {
        this.name = name;
        this.iconLogo = iconLogo;
        this.addressCentral = addressCentral;
    }

    /**
     * Get Name Bank
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Get Logo Bank
     * @return
     */
    public Integer getIconLogo() {
        return iconLogo;
    }

    /**
     * Get Address Of.Central Bank
     * @return
     */
    public String getAddressCentral() {
        return addressCentral;
    }
}
