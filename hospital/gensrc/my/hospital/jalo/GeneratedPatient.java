/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 6-nov-2017 0.33.24                          ---
 * ----------------------------------------------------------------
 */
package my.hospital.jalo;

import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import my.hospital.constants.HospitalConstants;
import my.hospital.jalo.Individual1;
import my.hospital.jalo.Ward;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Patient}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedPatient extends Individual1
{
	/** Qualifier of the <code>Patient.dateofRecovery</code> attribute **/
	public static final String DATEOFRECOVERY = "dateofRecovery";
	/** Qualifier of the <code>Patient.exitofHospital</code> attribute **/
	public static final String EXITOFHOSPITAL = "exitofHospital";
	/** Qualifier of the <code>Patient.ward</code> attribute **/
	public static final String WARD = "ward";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n WARD's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedPatient> WARDHANDLER = new BidirectionalOneToManyHandler<GeneratedPatient>(
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
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(Individual1.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(DATEOFRECOVERY, AttributeMode.INITIAL);
		tmp.put(EXITOFHOSPITAL, AttributeMode.INITIAL);
		tmp.put(WARD, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		WARDHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Patient.dateofRecovery</code> attribute.
	 * @return the dateofRecovery
	 */
	public Date getDateofRecovery(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, DATEOFRECOVERY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Patient.dateofRecovery</code> attribute.
	 * @return the dateofRecovery
	 */
	public Date getDateofRecovery()
	{
		return getDateofRecovery( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Patient.dateofRecovery</code> attribute. 
	 * @param value the dateofRecovery
	 */
	public void setDateofRecovery(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, DATEOFRECOVERY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Patient.dateofRecovery</code> attribute. 
	 * @param value the dateofRecovery
	 */
	public void setDateofRecovery(final Date value)
	{
		setDateofRecovery( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Patient.exitofHospital</code> attribute.
	 * @return the exitofHospital
	 */
	public Date getExitofHospital(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, EXITOFHOSPITAL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Patient.exitofHospital</code> attribute.
	 * @return the exitofHospital
	 */
	public Date getExitofHospital()
	{
		return getExitofHospital( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Patient.exitofHospital</code> attribute. 
	 * @param value the exitofHospital
	 */
	public void setExitofHospital(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, EXITOFHOSPITAL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Patient.exitofHospital</code> attribute. 
	 * @param value the exitofHospital
	 */
	public void setExitofHospital(final Date value)
	{
		setExitofHospital( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Patient.ward</code> attribute.
	 * @return the ward
	 */
	public Ward getWard(final SessionContext ctx)
	{
		return (Ward)getProperty( ctx, WARD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Patient.ward</code> attribute.
	 * @return the ward
	 */
	public Ward getWard()
	{
		return getWard( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Patient.ward</code> attribute. 
	 * @param value the ward
	 */
	public void setWard(final SessionContext ctx, final Ward value)
	{
		WARDHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Patient.ward</code> attribute. 
	 * @param value the ward
	 */
	public void setWard(final Ward value)
	{
		setWard( getSession().getSessionContext(), value );
	}
	
}
