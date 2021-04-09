package site.renjeka.carmanager;

public interface Serviceable {
	public boolean isReadyToService();
	public int getDistanceOnService();
	public void addDistance(int additionalDistance) throws Throwable;
	public void addDistance(double additionalDistance) throws Throwable;
}
