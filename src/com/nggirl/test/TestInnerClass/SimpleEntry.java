package com.nggirl.test.TestInnerClass;

import java.util.Map;

/**
 * @author zhangliuyang
 * @email zhangliuyang@nggirl.com.cn
 * @date 2015/11/9  17:13
 */
abstract class SimpleEntry<K,V>  implements Map.Entry<K,V>,java.io.Serializable{
    private final K key;
    private V value;
    public SimpleEntry(K key,V value){
        this.key = key;
        this.value = value;
    }
    public SimpleEntry(Map.Entry<? extends  K,?extends V> entry){
        this.key = entry.getKey();
        this.value = entry.getValue();
    }
    public K getKey(){
        return key;
    }
    public V getValue(){
        return value;
    }
    public V setValue(V value){
        V oldValue = this.value;
        this.value = value;
        return  oldValue;
    }
    public boolean equals(Object o){
        if (o == this){
            return true;
        }
        if (o.getClass() == SimpleEntry.class){
            SimpleEntry se = (SimpleEntry)o;
            return se.getKey().equals(getKey());
        }
        return false;
    }
    public int hashCode(){
        return key == null ? 0 : key.hashCode();
    }
    public String toString(){
        return key + "=" + value;
    }
}
