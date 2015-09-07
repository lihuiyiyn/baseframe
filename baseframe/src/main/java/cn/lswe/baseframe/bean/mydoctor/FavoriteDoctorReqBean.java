/**
 * 
 */
package cn.lswe.baseframe.bean.mydoctor;

/**
 * @author LauShallwe
 *
 */
public class FavoriteDoctorReqBean {

	/**
	 * 医生ID
	 */
	private int doctor_id;

	/**
	 * @return the doctor_id
	 */
	public int getDoctor_id() {
		return doctor_id;
	}

	/**
	 * @param doctor_id
	 *            the doctor_id to set
	 */
	public void setDoctor_id(int doctor_id) {
		this.doctor_id = doctor_id;
	}

	@Override
	public String toString() {
		return "FavoriteDoctorReqBean [doctor_id=" + doctor_id + ", toString()=" + super.toString() + "]";
	}
}
