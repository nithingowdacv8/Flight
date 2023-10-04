package com.pratyush.reservation.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.Id;
// import jakarta.persistence.Table;

// public class Inventory {
    
// }

@Entity
@Table(name="inventory")
public class Inventory {
	
	@Id
	@GeneratedValue
	private long inventoryId;
	
	private int count;
	
	public long getInventoryId() {
		return inventoryId;
	}


	public void setInventoryId(long inventoryId) {
		this.inventoryId = inventoryId;
	}


	public Inventory() {
		
	}
	

	public Inventory(int count) {
		super();
		this.count = count;
	}

	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "Inventory [inventoryId=" + inventoryId + ", count=" + count + "]";
	}
	
}

