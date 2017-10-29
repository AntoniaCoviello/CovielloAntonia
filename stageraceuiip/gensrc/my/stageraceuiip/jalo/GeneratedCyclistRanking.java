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
import java.util.HashMap;
import java.util.Map;
import my.stageraceuiip.constants.StageraceuiipConstants;
import my.stageraceuiip.jalo.Cyclist;
import my.stageraceuiip.jalo.StageRace;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem CyclistRanking}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCyclistRanking extends GenericItem
{
	/** Qualifier of the <code>CyclistRanking.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>CyclistRanking.position</code> attribute **/
	public static final String POSITION = "position";
	/** Qualifier of the <code>CyclistRanking.timetot</code> attribute **/
	public static final String TIMETOT = "timetot";
	/** Qualifier of the <code>CyclistRanking.stagerace</code> attribute **/
	public static final String STAGERACE = "stagerace";
	/** Qualifier of the <code>CyclistRanking.cyclists</code> attribute **/
	public static final String CYCLISTS = "cyclists";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n STAGERACE's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedCyclistRanking> STAGERACEHANDLER = new BidirectionalOneToManyHandler<GeneratedCyclistRanking>(
	StageraceuiipConstants.TC.CYCLISTRANKING,
	false,
	"stagerace",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n CYCLISTS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Cyclist> CYCLISTSHANDLER = new OneToManyHandler<Cyclist>(
	StageraceuiipConstants.TC.CYCLIST,
	false,
	"stagerankings",
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
		tmp.put(POSITION, AttributeMode.INITIAL);
		tmp.put(TIMETOT, AttributeMode.INITIAL);
		tmp.put(STAGERACE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CyclistRanking.code</code> attribute.
	 * @return the code
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CyclistRanking.code</code> attribute.
	 * @return the code
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CyclistRanking.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CyclistRanking.code</code> attribute. 
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
	 * <i>Generated method</i> - Getter of the <code>CyclistRanking.cyclists</code> attribute.
	 * @return the cyclists
	 */
	public Collection<Cyclist> getCyclists(final SessionContext ctx)
	{
		return CYCLISTSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CyclistRanking.cyclists</code> attribute.
	 * @return the cyclists
	 */
	public Collection<Cyclist> getCyclists()
	{
		return getCyclists( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CyclistRanking.cyclists</code> attribute. 
	 * @param value the cyclists
	 */
	public void setCyclists(final SessionContext ctx, final Collection<Cyclist> value)
	{
		CYCLISTSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CyclistRanking.cyclists</code> attribute. 
	 * @param value the cyclists
	 */
	public void setCyclists(final Collection<Cyclist> value)
	{
		setCyclists( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to cyclists. 
	 * @param value the item to add to cyclists
	 */
	public void addToCyclists(final SessionContext ctx, final Cyclist value)
	{
		CYCLISTSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to cyclists. 
	 * @param value the item to add to cyclists
	 */
	public void addToCyclists(final Cyclist value)
	{
		addToCyclists( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from cyclists. 
	 * @param value the item to remove from cyclists
	 */
	public void removeFromCyclists(final SessionContext ctx, final Cyclist value)
	{
		CYCLISTSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from cyclists. 
	 * @param value the item to remove from cyclists
	 */
	public void removeFromCyclists(final Cyclist value)
	{
		removeFromCyclists( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CyclistRanking.position</code> attribute.
	 * @return the position
	 */
	public Integer getPosition(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, POSITION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CyclistRanking.position</code> attribute.
	 * @return the position
	 */
	public Integer getPosition()
	{
		return getPosition( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CyclistRanking.position</code> attribute. 
	 * @return the position
	 */
	public int getPositionAsPrimitive(final SessionContext ctx)
	{
		Integer value = getPosition( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CyclistRanking.position</code> attribute. 
	 * @return the position
	 */
	public int getPositionAsPrimitive()
	{
		return getPositionAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CyclistRanking.position</code> attribute. 
	 * @param value the position
	 */
	public void setPosition(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, POSITION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CyclistRanking.position</code> attribute. 
	 * @param value the position
	 */
	public void setPosition(final Integer value)
	{
		setPosition( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CyclistRanking.position</code> attribute. 
	 * @param value the position
	 */
	public void setPosition(final SessionContext ctx, final int value)
	{
		setPosition( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CyclistRanking.position</code> attribute. 
	 * @param value the position
	 */
	public void setPosition(final int value)
	{
		setPosition( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CyclistRanking.stagerace</code> attribute.
	 * @return the stagerace
	 */
	public StageRace getStagerace(final SessionContext ctx)
	{
		return (StageRace)getProperty( ctx, STAGERACE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CyclistRanking.stagerace</code> attribute.
	 * @return the stagerace
	 */
	public StageRace getStagerace()
	{
		return getStagerace( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CyclistRanking.stagerace</code> attribute. 
	 * @param value the stagerace
	 */
	public void setStagerace(final SessionContext ctx, final StageRace value)
	{
		STAGERACEHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CyclistRanking.stagerace</code> attribute. 
	 * @param value the stagerace
	 */
	public void setStagerace(final StageRace value)
	{
		setStagerace( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CyclistRanking.timetot</code> attribute.
	 * @return the timetot
	 */
	public Integer getTimetot(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, TIMETOT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CyclistRanking.timetot</code> attribute.
	 * @return the timetot
	 */
	public Integer getTimetot()
	{
		return getTimetot( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CyclistRanking.timetot</code> attribute. 
	 * @return the timetot
	 */
	public int getTimetotAsPrimitive(final SessionContext ctx)
	{
		Integer value = getTimetot( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CyclistRanking.timetot</code> attribute. 
	 * @return the timetot
	 */
	public int getTimetotAsPrimitive()
	{
		return getTimetotAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CyclistRanking.timetot</code> attribute. 
	 * @param value the timetot
	 */
	public void setTimetot(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, TIMETOT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CyclistRanking.timetot</code> attribute. 
	 * @param value the timetot
	 */
	public void setTimetot(final Integer value)
	{
		setTimetot( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CyclistRanking.timetot</code> attribute. 
	 * @param value the timetot
	 */
	public void setTimetot(final SessionContext ctx, final int value)
	{
		setTimetot( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CyclistRanking.timetot</code> attribute. 
	 * @param value the timetot
	 */
	public void setTimetot(final int value)
	{
		setTimetot( getSession().getSessionContext(), value );
	}
	
}
