package com.ysc.test.spring.lookup;

/**
 * ���ǰ��������ΪBeanB. (Hp����Ѫ��... ��Ϸ��ĳ��Ӣ�۵�Ѫ�����ڱ仯) (����˵����ϣ��ͨ��Ӣ�����ҵ���Ӣ�۵�Ѫ��ʵʱ�仯��. )
 */
public class HpDaoImpl implements HpDao {
	public int getHp() {
		// ����0~100֮����漴��
		return (int) (Math.random() * 100);
	}
}