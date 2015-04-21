package com.ysc.test.spring.lookup;

/** 
 * ���ǰ��������ΪBeanA.  
 * ����һ��������. ΪʲôҪ����? ��Ϊ�и����󷽷�.. 
 * ��Ȼ������, �Ͳ���final... �м��м� 
 */  
public abstract class HpServiceImpl implements HpService  
{  
    // protected����  
    protected HpDao hpDao = getHpDao();  
      
    /* 
     * ��������ǳ����. 
     * ���ص���cglib�����BeanB������. 
     */  
    public abstract HpDao getHpDao();  
      
    public int getHp()  
    {  
        // ����ԭ��BeanB�ķ���  
        return hpDao.getHp();  
    }  
}  