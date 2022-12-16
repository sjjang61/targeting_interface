package com.abtest.server.bo.targeting.operator;

public enum TargetingOperatorFactory {
	EQUAL { // 동일
		@Override
		public TargetingOperator getInstance() {
			return new TargetingOperatorEqual();
		}
	},
	NOT_EQUAL { //
		@Override
		public TargetingOperator getInstance() {
			return new TargetingOperatorNotEqual();
		}
	},
	GREATOR { // 초과
		@Override
		public TargetingOperator getInstance() {
			return new TargetingOperatorGreator();
		}
	},
	GREATOR_OR_EQUAL {
		@Override
		public TargetingOperator getInstance() {
			return new TargetingOperatorGreator();
		}
	},
	LESS{
		@Override
		public TargetingOperator getInstance() { return new TargetingOperatorLess(); }
	},
	LESS_OR_EQUAL{
		@Override
		public TargetingOperator getInstance() {
			return new TargetingOperatorGreator();
		}
	},
	CONTAINS {
		@Override
		public TargetingOperator getInstance() { return new TargetingOperatorContains(); }
	},
	;
	
	public abstract TargetingOperator getInstance();
}
