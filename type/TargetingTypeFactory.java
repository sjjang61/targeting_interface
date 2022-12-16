package com.abtest.server.bo.targeting.type;

public enum TargetingTypeFactory {
	AGE {
		@Override
		public TargetingType getInstance() {
			return new TargetingTypeAge();
		}
	},
	SEX {
		@Override
		public TargetingType getInstance() {
			return new TargetingTypeSex();
		}
	},
	OS {
		@Override
		public TargetingType getInstance() {
			return new TargetingTypeOs();
		}
	},
	;
	
	public abstract TargetingType getInstance();
}
