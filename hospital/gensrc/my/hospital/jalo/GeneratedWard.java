/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 6-nov-2017 0.33.24                          ---
 * ----------------------------------------------------------------
 */
package my.hospital.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import my.hospital.constants.HospitalConstants;
import my.hospital.jalo.Doctor;
import my.hospital.jalo.Patient;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Ward}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedWard extends GenericItem
{
	/** Qualifier of the <code>Ward.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>Ward.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>Ward.doctors</code> attribute **/
	public static final String DOCTORS = "doctors";
	/** Qualifier of the <code>Ward.patients</code> attribute **/
	public static final String PATIENTS = "patients";
	/**
	* {@link OneToManyHandler} for handling 1:n DOCTORS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Doctor> DOCTORSHANDLER = new OneToManyHandler<Doctor>(
	HospitalConstants.TC.DOCTOR,
	false,
	"ward",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n PATIENTS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Patient> PATIENTSHANDLER = new OneToManyHandler<Patient>(
	HospitalConstants.TC.PATIENT,
	false,
	"ward",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(NAME, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ward.code</code> attribute.
	 * @return the code
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ward.code</code> attribute.
	 * @return the code
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ward.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ward.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ward.doctors</code> attribute.
	 * @return the doctors
	 */
	public Collection<Doctor> getDoctors(final SessionContext ctx)
	{
		return DOCTORSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ward.doctors</code> attribute.
	 * @return the doctors
	 */
	public Collection<Doctor> getDoctors()
	{
		return getDoctors( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ward.doctors</code> attribute. 
	 * @param value the doctors
	 */
	public void setDoctors(final SessionContext ctx, final Collection<Doctor> value)
	{
		DOCTORSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ward.doctors</code> attribute. 
	 * @param value the doctors
	 */
	public void setDoctors(final Collection<Doctor> value)
	{
		setDoctors( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to doctors. 
	 * @param value the item to add to doctors
	 */
	public void addToDoctors(final SessionContext ctx, final Doctor value)
	{
		DOCTORSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to doctors. 
	 * @param value the item to add to doctors
	 */
	public void addToDoctors(final Doctor value)
	{
		addToDoctors( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from doctors. 
	 * @param value the item to remove from doctors
	 */
	public void removeFromDoctors(final SessionContext ctx, final Doctor value)
	{
		DOCTORSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from doctors. 
	 * @param value the item to remove from doctors
	 */
	public void removeFromDoctors(final Doctor value)
	{
		removeFromDoctors( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ward.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ward.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ward.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ward.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ward.patients</code> attribute.
	 * @return the patients
	 */
	public Collection<Patient> getPatients(final SessionContext ctx)
	{
		return PATIENTSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ward.patients</code> attribute.
	 * @return the patients
	 */
	public Collection<Patient> getPatients()
	{
		return getPatients( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ward.patients</code> attribute. 
	 * @param value the patients
	 */
	public void setPatients(final SessionContext ctx, final Collection<Patient> value)
	{
		PATIENTSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ward.patients</code> attribute. 
	 * @param value the patients
	 */
	public void setPatients(final Collection<Patient> value)
	{
		setPatients( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to patients. 
	 * @param value the item to add to patients
	 */
	public void addToPatients(final SessionContext ctx, final Patient value)
	{
		PATIENTSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to patients. 
	 * @param value the item to add to patients
	 */
	public void addToPatients(final Patient value)
	{
		addToPatients( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from patients. 
	 * @param value the item to remove from patients
	 */
	public void removeFromPatients(final SessionContext ctx, final Patient value)
	{
		PATIENTSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from patients. 
	 * @param value the item to remove from patients
	 */
	public void removeFromPatients(final Patient value)
	{
		removeFromPatients( getSession().getSessionContext(), value );
	}
	
}
