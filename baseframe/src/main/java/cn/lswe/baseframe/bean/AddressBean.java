/**
 * 
 */
package cn.lswe.baseframe.bean;

/**
 * @author sam
 */
public class AddressBean {

	/**
	 * 国家
	 */
	private String country;

	/**
	 * 省市
	 */
	private String provinces;

	/**
	 * 城市
	 */
	private String city;

	/**
	 * 其他
	 */
	private String extra;

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country
	 *            the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the provinces
	 */
	public String getProvinces() {
		return provinces;
	}

	/**
	 * @param provinces
	 *            the provinces to set
	 */
	public void setProvinces(String provinces) {
		this.provinces = provinces;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city
	 *            the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the extra
	 */
	public String getExtra() {
		return extra;
	}

	/**
	 * @param extra
	 *            the extra to set
	 */
	public void setExtra(String extra) {
		this.extra = extra;
	}

	@Override
	public String toString() {
		return "AddressBean [country=" + country + ", provinces=" + provinces + ", city=" + city + ", extra=" + extra
				+ "]";
	}
}
