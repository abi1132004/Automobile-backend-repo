package com.example.myapp.model;

	import jakarta.persistence.Column;
	import jakarta.persistence.Entity;
	import jakarta.persistence.Id;
	import jakarta.persistence.Table;

	@Entity
	@Table(name="autoapp")
		public class ApiModel {

		@Id
		@Column(name="id")
		private int id;
		
		@Column(name="brandName")
		private String brandName;
		
		@Column(name="price")
		private int price;
		
		@Column (name="quantity")
		private int quantity;
		
		@Column(name="automobileName")
		private String automobileName;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getBrandName() {
			return brandName;
		}

		public void setBrandName(String brandName) {
			this.brandName = brandName;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

		public int getQuantity() {
			return quantity;
		}

		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}

		public String getAutomobileName() {
			return automobileName;
		}

		public void setAutomobileName(String automobileName) {
			this.automobileName = automobileName;
		}

		public ApiModel() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
	}

