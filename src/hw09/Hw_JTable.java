package hw09;

import javax.swing.table.AbstractTableModel;

public class Hw_JTable extends AbstractTableModel{
	
	

	// 1. 컬럼명(열의 대표이름)을 배열로 만든다.
		String[] name = { "ID", "Name", "Phone", "Address", "Company" };

		String[][] data = { 
				{ "100", "dada", "010-4554-9851", "seoul", "cj" },
				{ "101", "jenho", "010-4554-9851", "seoul", "asdf" },
				{ "102", "cccc", "010-4554-9851", "seoul", "ict" },
				{ "103", "dddd", "010-4554-9851", "seoul", "iaefs" },
				
		
		};

		// 행의 수 = rows
		@Override
		public int getRowCount() {
			return data.length;
		}

		// 열의 수 = Column
		@Override
		public int getColumnCount() {
			return name.length;
		}

		// 내용 삽입
		@Override
		public Object getValueAt(int rowIndex, int columnIndex) {
			return data[rowIndex][columnIndex];
		}

		// 열의 이름설정
		// ** 스크롤패인에 추가하지 않으면, 이믈삽입이 안된다 **
		@Override
		public String getColumnName(int column) {
			return name[column];
		}

		// 내용 수정
		@Override

		public boolean isCellEditable(int rowIndex, int columnIndex) {
			if (columnIndex != 0) {
				return true;
			}else {
				return false;
			}
		}

		// 고친내용 적용하기
		@Override
		public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
			data[rowIndex][columnIndex] = (String) aValue;
		}

}
