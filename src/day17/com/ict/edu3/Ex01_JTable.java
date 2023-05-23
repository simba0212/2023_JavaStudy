package day17.com.ict.edu3;

import java.io.StreamCorruptedException;

import javax.swing.table.AbstractTableModel;

// 테이블을 만들기 위해서는 AbstractTableModel
public class Ex01_JTable extends AbstractTableModel {

	// 1. 컬럼명(열의 대표이름)을 배열로 만든다.
	String[] name = { "번호", "아이디", "패스워드", "나이", "성별" };

	String[][] data = { { "1", "aaaa", "a111", "12", "true" }, { "2", "bbbb", "b111", "15", "true" },
			{ "3", "cccc", "c111", "18", "true" }, { "4", "dddd", "d111", "10", "true" } };

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
