/**
 */
package eu.learnpad.transformations.ado.impl;

import eu.learnpad.transformations.ado.ATTRIBUTEType;
import eu.learnpad.transformations.ado.AdoPackage;
import eu.learnpad.transformations.ado.CONNECTORType;
import eu.learnpad.transformations.ado.FROMType;
import eu.learnpad.transformations.ado.INTERREFType;
import eu.learnpad.transformations.ado.RECORDType;
import eu.learnpad.transformations.ado.TOType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CONNECTOR Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.learnpad.transformations.ado.impl.CONNECTORTypeImpl#getFROM <em>FROM</em>}</li>
 *   <li>{@link eu.learnpad.transformations.ado.impl.CONNECTORTypeImpl#getTO <em>TO</em>}</li>
 *   <li>{@link eu.learnpad.transformations.ado.impl.CONNECTORTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link eu.learnpad.transformations.ado.impl.CONNECTORTypeImpl#getATTRIBUTE <em>ATTRIBUTE</em>}</li>
 *   <li>{@link eu.learnpad.transformations.ado.impl.CONNECTORTypeImpl#getRECORD <em>RECORD</em>}</li>
 *   <li>{@link eu.learnpad.transformations.ado.impl.CONNECTORTypeImpl#getINTERREF <em>INTERREF</em>}</li>
 *   <li>{@link eu.learnpad.transformations.ado.impl.CONNECTORTypeImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link eu.learnpad.transformations.ado.impl.CONNECTORTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CONNECTORTypeImpl extends MinimalEObjectImpl.Container implements CONNECTORType {
	/**
	 * The cached value of the '{@link #getFROM() <em>FROM</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFROM()
	 * @generated
	 * @ordered
	 */
	protected FROMType fROM;

	/**
	 * The cached value of the '{@link #getTO() <em>TO</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTO()
	 * @generated
	 * @ordered
	 */
	protected TOType tO;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * The default value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected String class_ = CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CONNECTORTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdoPackage.Literals.CONNECTOR_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FROMType getFROM() {
		return fROM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFROM(FROMType newFROM, NotificationChain msgs) {
		FROMType oldFROM = fROM;
		fROM = newFROM;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdoPackage.CONNECTOR_TYPE__FROM, oldFROM, newFROM);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFROM(FROMType newFROM) {
		if (newFROM != fROM) {
			NotificationChain msgs = null;
			if (fROM != null)
				msgs = ((InternalEObject)fROM).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdoPackage.CONNECTOR_TYPE__FROM, null, msgs);
			if (newFROM != null)
				msgs = ((InternalEObject)newFROM).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdoPackage.CONNECTOR_TYPE__FROM, null, msgs);
			msgs = basicSetFROM(newFROM, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoPackage.CONNECTOR_TYPE__FROM, newFROM, newFROM));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TOType getTO() {
		return tO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTO(TOType newTO, NotificationChain msgs) {
		TOType oldTO = tO;
		tO = newTO;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdoPackage.CONNECTOR_TYPE__TO, oldTO, newTO);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTO(TOType newTO) {
		if (newTO != tO) {
			NotificationChain msgs = null;
			if (tO != null)
				msgs = ((InternalEObject)tO).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdoPackage.CONNECTOR_TYPE__TO, null, msgs);
			if (newTO != null)
				msgs = ((InternalEObject)newTO).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdoPackage.CONNECTOR_TYPE__TO, null, msgs);
			msgs = basicSetTO(newTO, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoPackage.CONNECTOR_TYPE__TO, newTO, newTO));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, AdoPackage.CONNECTOR_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ATTRIBUTEType> getATTRIBUTE() {
		return getGroup().list(AdoPackage.Literals.CONNECTOR_TYPE__ATTRIBUTE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RECORDType> getRECORD() {
		return getGroup().list(AdoPackage.Literals.CONNECTOR_TYPE__RECORD);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<INTERREFType> getINTERREF() {
		return getGroup().list(AdoPackage.Literals.CONNECTOR_TYPE__INTERREF);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClass_() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass(String newClass) {
		String oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoPackage.CONNECTOR_TYPE__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoPackage.CONNECTOR_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdoPackage.CONNECTOR_TYPE__FROM:
				return basicSetFROM(null, msgs);
			case AdoPackage.CONNECTOR_TYPE__TO:
				return basicSetTO(null, msgs);
			case AdoPackage.CONNECTOR_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case AdoPackage.CONNECTOR_TYPE__ATTRIBUTE:
				return ((InternalEList<?>)getATTRIBUTE()).basicRemove(otherEnd, msgs);
			case AdoPackage.CONNECTOR_TYPE__RECORD:
				return ((InternalEList<?>)getRECORD()).basicRemove(otherEnd, msgs);
			case AdoPackage.CONNECTOR_TYPE__INTERREF:
				return ((InternalEList<?>)getINTERREF()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AdoPackage.CONNECTOR_TYPE__FROM:
				return getFROM();
			case AdoPackage.CONNECTOR_TYPE__TO:
				return getTO();
			case AdoPackage.CONNECTOR_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case AdoPackage.CONNECTOR_TYPE__ATTRIBUTE:
				return getATTRIBUTE();
			case AdoPackage.CONNECTOR_TYPE__RECORD:
				return getRECORD();
			case AdoPackage.CONNECTOR_TYPE__INTERREF:
				return getINTERREF();
			case AdoPackage.CONNECTOR_TYPE__CLASS:
				return getClass_();
			case AdoPackage.CONNECTOR_TYPE__ID:
				return getId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AdoPackage.CONNECTOR_TYPE__FROM:
				setFROM((FROMType)newValue);
				return;
			case AdoPackage.CONNECTOR_TYPE__TO:
				setTO((TOType)newValue);
				return;
			case AdoPackage.CONNECTOR_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case AdoPackage.CONNECTOR_TYPE__ATTRIBUTE:
				getATTRIBUTE().clear();
				getATTRIBUTE().addAll((Collection<? extends ATTRIBUTEType>)newValue);
				return;
			case AdoPackage.CONNECTOR_TYPE__RECORD:
				getRECORD().clear();
				getRECORD().addAll((Collection<? extends RECORDType>)newValue);
				return;
			case AdoPackage.CONNECTOR_TYPE__INTERREF:
				getINTERREF().clear();
				getINTERREF().addAll((Collection<? extends INTERREFType>)newValue);
				return;
			case AdoPackage.CONNECTOR_TYPE__CLASS:
				setClass((String)newValue);
				return;
			case AdoPackage.CONNECTOR_TYPE__ID:
				setId((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AdoPackage.CONNECTOR_TYPE__FROM:
				setFROM((FROMType)null);
				return;
			case AdoPackage.CONNECTOR_TYPE__TO:
				setTO((TOType)null);
				return;
			case AdoPackage.CONNECTOR_TYPE__GROUP:
				getGroup().clear();
				return;
			case AdoPackage.CONNECTOR_TYPE__ATTRIBUTE:
				getATTRIBUTE().clear();
				return;
			case AdoPackage.CONNECTOR_TYPE__RECORD:
				getRECORD().clear();
				return;
			case AdoPackage.CONNECTOR_TYPE__INTERREF:
				getINTERREF().clear();
				return;
			case AdoPackage.CONNECTOR_TYPE__CLASS:
				setClass(CLASS_EDEFAULT);
				return;
			case AdoPackage.CONNECTOR_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AdoPackage.CONNECTOR_TYPE__FROM:
				return fROM != null;
			case AdoPackage.CONNECTOR_TYPE__TO:
				return tO != null;
			case AdoPackage.CONNECTOR_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case AdoPackage.CONNECTOR_TYPE__ATTRIBUTE:
				return !getATTRIBUTE().isEmpty();
			case AdoPackage.CONNECTOR_TYPE__RECORD:
				return !getRECORD().isEmpty();
			case AdoPackage.CONNECTOR_TYPE__INTERREF:
				return !getINTERREF().isEmpty();
			case AdoPackage.CONNECTOR_TYPE__CLASS:
				return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
			case AdoPackage.CONNECTOR_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (group: ");
		result.append(group);
		result.append(", class: ");
		result.append(class_);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //CONNECTORTypeImpl
