package db;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import org.codehaus.jackson.map.ObjectMapper;
import org.hibernate.HibernateException;
import org.hibernate.usertype.UserType;

/**
 * 目標:將json格式的資料存入資料庫當中，透過hibernate的userType(使用者自定義型別)
 * 
 * @author Simon Tsai
 * @since 2017年1月9日
 *
 */
public class othersUserType implements UserType {
	
	ObjectMapper oMapper = new ObjectMapper();//透過jackson.jar中的objectmapper將java 與json進行互轉
	final static int sqlType = Types.OTHER;
	

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hibernate.usertype.UserType#assemble(java.io.Serializable,
	 * java.lang.Object) 將傳入的參數arg1 or arg0 重新組裝成另一個物件
	 */
	public Object assemble(Serializable arg0, Object arg1) throws HibernateException {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * 提供自定义类型的完全复制方法 本方法将用構造返回對象 当nullSafeGet方法调用之后，我们获得了自定义数据对象，在向用户返回自定义数据之前，
	 * deepCopy方法将被调用，它将根据自定义数据对象构造一个完全拷贝，并将此拷贝返回给用户
	 * 此时我们就得到了自定义数据对象的两个版本，第一个是从数据库读出的原始版本，其二是我们通过
	 * deepCopy方法构造的复制版本，原始的版本将有Hibernate维护，复制版由用户使用。原始版本用作
	 * 稍后的脏数据检查依据；Hibernate将在脏数据检查过程中将两个版本的数据进行对比（通过调用
	 * equals方法），如果数据发生了变化（equals方法返回false），则执行对应的持久化操作
	 */
	public Object deepCopy(Object value) throws HibernateException {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hibernate.usertype.UserType#disassemble(java.lang.Object)
	 * 將傳入的參數arg1 or arg0 重新拆解成另一個物件
	 */
	public Serializable disassemble(Object arg0) throws HibernateException {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * 比較兩個參數之間是否相同(主要用來比較資料庫的原始數據與user所給予的資料是否有說不同)， 如不同則進行資料庫的更新
	 */
	public boolean equals(Object arg0, Object arg1) throws HibernateException {
		// TODO Auto-generated method stub
		return false;
	}

	public int hashCode(Object arg0) throws HibernateException {
		// TODO Auto-generated method stub
		return 0;
	}

	/*
	 * 是否可改變本類型的instance
	 */
	public boolean isMutable() {
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hibernate.usertype.UserType#nullSafeGet(java.sql.ResultSet,
	 * java.lang.String[], java.lang.Object) 
	 * 從JDBC ResultSet讀取數據,将其轉換為自定義類型後返回
	 * (此方法要求對可能出现null值進行處理) arg1中包含了當前自定義類型的映射字段名稱
	 */
	public Object nullSafeGet(ResultSet arg0, String[] arg1, Object arg2) throws HibernateException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.hibernate.usertype.UserType#nullSafeSet(java.sql.PreparedStatement,
	 * java.lang.Object, int) 
	 * 從JDBC ResultSet读取数据,将其转换为自定義類型後返回
	 * (此方法要求對可能出现null值進行處理) arg1中包含了當前自定義類型的映射字段名稱
	 */
	public void nullSafeSet(PreparedStatement arg0, Object arg1, int arg2) throws HibernateException, SQLException {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see org.hibernate.usertype.UserType#replace(java.lang.Object, java.lang.Object, java.lang.Object)
	 * arg0 == user所給予的新值
	 * arg1 == 欲變更的舊值
	 */
	public Object replace(Object arg0, Object arg1, Object arg2) throws HibernateException {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hibernate.usertype.UserType#returnedClass() 回傳本類別
	 */
	public Class returnedClass() {
		// TODO Auto-generated method stub
		return null;
	}

	public int[] sqlTypes() {
		// 回傳java 所認可的sql型態(參考java.sql.Types;)
		return null;
	}

}
