/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 29-ott-2017 22.49.21                        ---
 * ----------------------------------------------------------------
 */
package my.stageraceuiip.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import my.stageraceuiip.constants.StageraceuiipConstants;
import my.stageraceuiip.jalo.StageRace;
import my.stageraceuiip.jalo.StageRanking;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Stage}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedStage extends GenericItem
{
	/** Qualifier of the <code>Stage.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>Stage.startpoint</code> attribute **/
	public static final String STARTPOINT = "startpoint";
	/** Qualifier of the <code>Stage.endpoint</code> attribute **/
	public static final String ENDPOINT = "endpoint";
	/** Qualifier of the <code>Stage.km</code> attribute **/
	public static final String KM = "km";
	/** Qualifier of the <code>Stage.date</code> attribute **/
	public static final String DATE = "date";
	/** Qualifier of the <code>Stage.stagerace</code> attribute **/
	public static final String STAGERACE = "stagerace";
	/** Qualifier of the <code>Stage.stagerankings</code> attribute **/
	public static final String STAGERANKINGS = "stagerankings";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n STAGERACE's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedStage> STAGERACEHANDLER = new BidirectionalOneToManyHandler<GeneratedStage>(
	StageraceuiipConstants.TC.STAGE,
	false,
	"stagerace",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n STAGERANKINGS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<StageRanking> STAGERANKINGSHANDLER = new OneToManyHandler<StageRanking>(
	StageraceuiipConstants.TC.STAGERANKING,
	false,
	"stage",
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
		tmp.put(STARTPOINT, AttributeMode.INITIAL);
		tmp.put(ENDPOINT, AttributeMode.INITIAL);
		tmp.put(KM, AttributeMode.INITIAL);
		tmp.put(DATE, AttributeMode.INITIAL);
		tmp.put(STAGERACE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.code</code> attribute.
	 * @return the code
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.code</code> attribute.
	 * @return the code
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		STAGERACEHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.date</code> attribute.
	 * @return the date
	 */
	public Date getDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, DATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.date</code> attribute.
	 * @return the date
	 */
	public Date getDate()
	{
		return getDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.date</code> attribute. 
	 * @param value the date
	 */
	public void setDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, DATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.date</code> attribute. 
	 * @param value the date
	 */
	public void setDate(final Date value)
	{
		setDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.endpoint</code> attribute.
	 * @return the endpoint
	 */
	public String getEndpoint(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ENDPOINT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.endpoint</code> attribute.
	 * @return the endpoint
	 */
	public String getEndpoint()
	{
		return getEndpoint( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.endpoint</code> attribute. 
	 * @param value the endpoint
	 */
	public void setEndpoint(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ENDPOINT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.endpoint</code> attribute. 
	 * @param value the endpoint
	 */
	public void setEndpoint(final String value)
	{
		setEndpoint( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.km</code> attribute.
	 * @return the km
	 */
	public Float getKm(final SessionContext ctx)
	{
		return (Float)getProperty( ctx, KM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.km</code> attribute.
	 * @return the km
	 */
	public Float getKm()
	{
		return getKm( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.km</code> attribute. 
	 * @return the km
	 */
	public float getKmAsPrimitive(final SessionContext ctx)
	{
		Float value = getKm( ctx );
		return value != null ? value.floatValue() : 0.0f;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.km</code> attribute. 
	 * @return the km
	 */
	public float getKmAsPrimitive()
	{
		return getKmAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.km</code> attribute. 
	 * @param value the km
	 */
	public void setKm(final SessionContext ctx, final Float value)
	{
		setProperty(ctx, KM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.km</code> attribute. 
	 * @param value the km
	 */
	public void setKm(final Float value)
	{
		setKm( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.km</code> attribute. 
	 * @param value the km
	 */
	public void setKm(final SessionContext ctx, final float value)
	{
		setKm( ctx,Float.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.km</code> attribute. 
	 * @param value the km
	 */
	public void setKm(final float value)
	{
		setKm( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.stagerace</code> attribute.
	 * @return the stagerace
	 */
	public StageRace getStagerace(final SessionContext ctx)
	{
		return (StageRace)getProperty( ctx, STAGERACE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.stagerace</code> attribute.
	 * @return the stagerace
	 */
	public StageRace getStagerace()
	{
		return getStagerace( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.stagerace</code> attribute. 
	 * @param value the stagerace
	 */
	public void setStagerace(final SessionContext ctx, final StageRace value)
	{
		STAGERACEHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.stagerace</code> attribute. 
	 * @param value the stagerace
	 */
	public void setStagerace(final StageRace value)
	{
		setStagerace( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.stagerankings</code> attribute.
	 * @return the stagerankings
	 */
	public Collection<StageRanking> getStagerankings(final SessionContext ctx)
	{
		return STAGERANKINGSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.stagerankings</code> attribute.
	 * @return the stagerankings
	 */
	public Collection<StageRanking> getStagerankings()
	{
		return getStagerankings( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.stagerankings</code> attribute. 
	 * @param value the stagerankings
	 */
	public void setStagerankings(final SessionContext ctx, final Collection<StageRanking> value)
	{
		STAGERANKINGSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.stagerankings</code> attribute. 
	 * @param value the stagerankings
	 */
	public void setStagerankings(final Collection<StageRanking> value)
	{
		setStagerankings( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to stagerankings. 
	 * @param value the item to add to stagerankings
	 */
	public void addToStagerankings(final SessionContext ctx, final StageRanking value)
	{
		STAGERANKINGSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to stagerankings. 
	 * @param value the item to add to stagerankings
	 */
	public void addToStagerankings(final StageRanking value)
	{
		addToStagerankings( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from stagerankings. 
	 * @param value the item to remove from stagerankings
	 */
	public void removeFromStagerankings(final SessionContext ctx, final StageRanking value)
	{
		STAGERANKINGSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from stagerankings. 
	 * @param value the item to remove from stagerankings
	 */
	public void removeFromStagerankings(final StageRanking value)
	{
		removeFromStagerankings( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.startpoint</code> attribute.
	 * @return the startpoint
	 */
	public String getStartpoint(final SessionContext ctx)
	{
		return (String)getProperty( ctx, STARTPOINT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.startpoint</code> attribute.
	 * @return the startpoint
	 */
	public String getStartpoint()
	{
		return getStartpoint( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.startpoint</code> attribute. 
	 * @param value the startpoint
	 */
	public void setStartpoint(final SessionContext ctx, final String value)
	{
		setProperty(ctx, STARTPOINT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.startpoint</code> attribute. 
	 * @param value the startpoint
	 */
	public void setStartpoint(final String value)
	{
		setStartpoint( getSession().getSessionContext(), value );
	}
	
}
