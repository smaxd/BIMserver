/**
 * Copyright (C) 2011  BIMserver.org
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.bimserver.models.store.impl;

import org.bimserver.emf.IdEObjectImpl;
import org.bimserver.models.log.AccessMethod;
import org.bimserver.models.store.ExtendedDataSchema;
import org.bimserver.models.store.Project;
import org.bimserver.models.store.Service;
import org.bimserver.models.store.StorePackage;
import org.bimserver.models.store.Trigger;
import org.bimserver.models.store.User;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.models.store.impl.ServiceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.bimserver.models.store.impl.ServiceImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.bimserver.models.store.impl.ServiceImpl#getToken <em>Token</em>}</li>
 *   <li>{@link org.bimserver.models.store.impl.ServiceImpl#getNotificationProtocol <em>Notification Protocol</em>}</li>
 *   <li>{@link org.bimserver.models.store.impl.ServiceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.bimserver.models.store.impl.ServiceImpl#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link org.bimserver.models.store.impl.ServiceImpl#isReadRevision <em>Read Revision</em>}</li>
 *   <li>{@link org.bimserver.models.store.impl.ServiceImpl#getReadExtendedData <em>Read Extended Data</em>}</li>
 *   <li>{@link org.bimserver.models.store.impl.ServiceImpl#getWriteRevision <em>Write Revision</em>}</li>
 *   <li>{@link org.bimserver.models.store.impl.ServiceImpl#getWriteExtendedData <em>Write Extended Data</em>}</li>
 *   <li>{@link org.bimserver.models.store.impl.ServiceImpl#getProfileIdentifier <em>Profile Identifier</em>}</li>
 *   <li>{@link org.bimserver.models.store.impl.ServiceImpl#getProfileName <em>Profile Name</em>}</li>
 *   <li>{@link org.bimserver.models.store.impl.ServiceImpl#getProfileDescription <em>Profile Description</em>}</li>
 *   <li>{@link org.bimserver.models.store.impl.ServiceImpl#isProfilePublic <em>Profile Public</em>}</li>
 *   <li>{@link org.bimserver.models.store.impl.ServiceImpl#getProject <em>Project</em>}</li>
 *   <li>{@link org.bimserver.models.store.impl.ServiceImpl#getUser <em>User</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceImpl extends IdEObjectImpl implements Service {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StorePackage.Literals.SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String) eGet(StorePackage.Literals.SERVICE__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(StorePackage.Literals.SERVICE__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUrl() {
		return (String) eGet(StorePackage.Literals.SERVICE__URL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(String newUrl) {
		eSet(StorePackage.Literals.SERVICE__URL, newUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getToken() {
		return (String) eGet(StorePackage.Literals.SERVICE__TOKEN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToken(String newToken) {
		eSet(StorePackage.Literals.SERVICE__TOKEN, newToken);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessMethod getNotificationProtocol() {
		return (AccessMethod) eGet(StorePackage.Literals.SERVICE__NOTIFICATION_PROTOCOL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotificationProtocol(AccessMethod newNotificationProtocol) {
		eSet(StorePackage.Literals.SERVICE__NOTIFICATION_PROTOCOL, newNotificationProtocol);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String) eGet(StorePackage.Literals.SERVICE__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eSet(StorePackage.Literals.SERVICE__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trigger getTrigger() {
		return (Trigger) eGet(StorePackage.Literals.SERVICE__TRIGGER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrigger(Trigger newTrigger) {
		eSet(StorePackage.Literals.SERVICE__TRIGGER, newTrigger);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReadRevision() {
		return (Boolean) eGet(StorePackage.Literals.SERVICE__READ_REVISION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadRevision(boolean newReadRevision) {
		eSet(StorePackage.Literals.SERVICE__READ_REVISION, newReadRevision);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedDataSchema getReadExtendedData() {
		return (ExtendedDataSchema) eGet(StorePackage.Literals.SERVICE__READ_EXTENDED_DATA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadExtendedData(ExtendedDataSchema newReadExtendedData) {
		eSet(StorePackage.Literals.SERVICE__READ_EXTENDED_DATA, newReadExtendedData);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project getWriteRevision() {
		return (Project) eGet(StorePackage.Literals.SERVICE__WRITE_REVISION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWriteRevision(Project newWriteRevision) {
		eSet(StorePackage.Literals.SERVICE__WRITE_REVISION, newWriteRevision);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedDataSchema getWriteExtendedData() {
		return (ExtendedDataSchema) eGet(StorePackage.Literals.SERVICE__WRITE_EXTENDED_DATA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWriteExtendedData(ExtendedDataSchema newWriteExtendedData) {
		eSet(StorePackage.Literals.SERVICE__WRITE_EXTENDED_DATA, newWriteExtendedData);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProfileIdentifier() {
		return (String) eGet(StorePackage.Literals.SERVICE__PROFILE_IDENTIFIER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProfileIdentifier(String newProfileIdentifier) {
		eSet(StorePackage.Literals.SERVICE__PROFILE_IDENTIFIER, newProfileIdentifier);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProfileName() {
		return (String) eGet(StorePackage.Literals.SERVICE__PROFILE_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProfileName(String newProfileName) {
		eSet(StorePackage.Literals.SERVICE__PROFILE_NAME, newProfileName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProfileDescription() {
		return (String) eGet(StorePackage.Literals.SERVICE__PROFILE_DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProfileDescription(String newProfileDescription) {
		eSet(StorePackage.Literals.SERVICE__PROFILE_DESCRIPTION, newProfileDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isProfilePublic() {
		return (Boolean) eGet(StorePackage.Literals.SERVICE__PROFILE_PUBLIC, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProfilePublic(boolean newProfilePublic) {
		eSet(StorePackage.Literals.SERVICE__PROFILE_PUBLIC, newProfilePublic);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project getProject() {
		return (Project) eGet(StorePackage.Literals.SERVICE__PROJECT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProject(Project newProject) {
		eSet(StorePackage.Literals.SERVICE__PROJECT, newProject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User getUser() {
		return (User) eGet(StorePackage.Literals.SERVICE__USER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUser(User newUser) {
		eSet(StorePackage.Literals.SERVICE__USER, newUser);
	}

} //ServiceImpl