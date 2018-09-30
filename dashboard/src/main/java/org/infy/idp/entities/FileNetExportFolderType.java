/***********************************************************************************************
*
* Copyright 2018 Infosys Ltd.
* Use of this source code is governed by MIT license that can be found in the LICENSE file or at
* https://opensource.org/licenses/MIT.
*
***********************************************************************************************/
package org.infy.idp.entities;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FileNetExportFolderType {
	@SerializedName("objectStore")
	@Expose
	private String objectStore;

	@SerializedName("name")
	@Expose
	private String name;

	@SerializedName("id")
	@Expose
	private String id;
	
	@SerializedName("objectType")
	@Expose
	private String objectType="Folder";

	
	public String getObjectType() {
		return objectType;
	}

	public void setObjectType(String objectType) {
		this.objectType = objectType;
	}

	public String getObjectStore() {
		return objectStore;
	}

	public void setObjectStore(String objectStore) {
		this.objectStore = objectStore;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
