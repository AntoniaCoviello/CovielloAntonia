/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 6-nov-2017 0.33.24                          ---
 * ----------------------------------------------------------------
 */
package my.hospital.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import my.hospital.constants.HospitalConstants;
import my.hospital.jalo.Doctor;
import my.hospital.jalo.Patient;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Visit}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedVisit extends GenericItem
{
	/** Qualifier of the <code>Visit.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>Visit.dateofVisit</code> attribute **/
	public static final String DATEOFVISIT = "dateofVisit";
	/** Qualifier of the <code>Visit.result</code> attribute **/
	public static final String RESULT = "result";
	/** Qualifier of the <code>Visit.patient</code> attribute **/
	public static final String PATIENT = "patient";
	/** Qualifier of the <code>Visit.doctor</code> attribute **/
	public static final String DOCTOR = "doctor";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n DOCTOR's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedVisit> DOCTORHANDLER = new BidirectionalOneToManyHandler<GeneratedVisit>(
	HospitalConstants.TC.VISIT,
	false,
	"doctor",
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
		tmp.put(DATEOFVISIT, AttributeMode.INITIAL);
		tmp.put(RESULT, AttributeMode.INITIAL);
		tmp.put(PATIENT, AttributeMode.INITIAL);
		tmp.put(DOCTOR, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Visit.code</code> attribute.
	 * @return the code
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Visit.code</code> attribute.
	 * @return the code
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Visit.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Visit.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		DOCTORHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Visit.dateofVisit</code> attribute.
	 * @return the dateofVisit
	 */
	public Date getDateofVisit(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, DATEOFVISIT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Visit.dateofVisit</code> attribute.
	 * @return the dateofVisit
	 */
	public Date getDateofVisit()
	{
		return getDateofVisit( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Visit.dateofVisit</code> attribute. 
	 * @param value the dateofVisit
	 */
	public void setDateofVisit(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, DATEOFVISIT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Visit.dateofVisit</code> attribute. 
	 * @param value the dateofVisit
	 */
	public void setDateofVisit(final Date value)
	{
		setDateofVisit( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Visit.doctor</code> attribute.
	 * @return the doctor
	 */
	public Doctor getDoctor(final SessionContext ctx)
	{
		return (Doctor)getProperty( ctx, DOCTOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Visit.doctor</code> attribute.
	 * @return the doctor
	 */
	public Doctor getDoctor()
	{
		return getDoctor( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Visit.doctor</code> attribute. 
	 * @param value the doctor
	 */
	public void setDoctor(final SessionContext ctx, final Doctor value)
	{
		DOCTORHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Visit.doctor</code> attribute. 
	 * @param value the doctor
	 */
	public void setDoctor(final Doctor value)
	{
		setDoctor( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Visit.patient</code> attribute.
	 * @return the patient
	 */
	public Patient getPatient(final SessionContext ctx)
	{
		return (Patient)getProperty( ctx, PATIENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Visit.patient</code> attribute.
	 * @return the patient
	 */
	public Patient getPatient()
	{
		return getPatient( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Visit.patient</code> attribute. 
	 * @param value the patient
	 */
	public void setPatient(final SessionContext ctx, final Patient value)
	{
		setProperty(ctx, PATIENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Visit.patient</code> attribute. 
	 * @param value the patient
	 */
	public void setPatient(final Patient value)
	{
		setPatient( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Visit.result</code> attribute.
	 * @return the result
	 */
	public EnumerationValue getResult(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, RESULT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Visit.result</code> attribute.
	 * @return the result
	 */
	public EnumerationValue getResult()
	{
		return getResult( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Visit.result</code> attribute. 
	 * @param value the result
	 */
	public void setResult(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, RESULT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Visit.result</code> attribute. 
	 * @param value the result
	 */
	public void setResult(final EnumerationValue value)
	{
		setResult( getSession().getSessionContext(), value );
	}
	
}
