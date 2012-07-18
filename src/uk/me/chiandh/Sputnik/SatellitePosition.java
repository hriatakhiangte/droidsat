package uk.me.chiandh.Sputnik;



public class SatellitePosition {
	/**
	 * 
	 */
	public String name;
	public StringBuffer displayString;
	public double azimuth;
	public double azRadians;
	public double elRadians;
	public double elevation;
	public double range;
	public Satellite sat;
	public long positionTime;
	public double inclination, period, perigee, apogee;
	
	public SatellitePosition(String theName, String theDisplayString, 
			double theAzimuth, double theAzRadians, double theElRadians, double theElevation, double theRange, Satellite theSatellite){
		name = theName;
		displayString = new StringBuffer(theDisplayString);
		azimuth = theAzimuth;
		azRadians = theAzRadians;
		elevation = theElevation;
		elRadians = theElRadians;
		range = theRange;
		sat = theSatellite;
		inclination = theSatellite.itsSDP4.inclination;
		apogee = theSatellite.itsSDP4.apogee;
		perigee = theSatellite.itsSDP4.perigee;
		period = theSatellite.itsSDP4.period;

		
	}
	
	public String toString(){
		return this.displayString.toString();
	}

}
