package com.diegacho.entity;

public enum Peso {
	/**
	 * Estado Aprobado
	 */
	DOS {
		public String getName() {
			return "DOS";
		}
	},
	/**
	 * Estado Pendiente
	 */
	CINCO {
		public String getName() {
			return "CINCO";
		}
	},
	/**
	 * Estado Rechazado
	 */
	DIEZ {
		public String getName() {
			return "DIEZ";
		}
	};

	

	public abstract String getName();

	public int getOrdinal() {
		return this.ordinal();
	}
}


