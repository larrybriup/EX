package spring.ex.eagle.bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollBean {
	private List<String> lists;
	private String[] arrays;
	private Set<String> sets;
	private Map<Integer, String> maps;
	private Properties pros;
	public List<String> getLists() {
		return lists;
	}
	public void setLists(List<String> lists) {
		this.lists = lists;
	}
	public String[] getArrays() {
		return arrays;
	}
	public void setArrays(String[] arrays) {
		this.arrays = arrays;
	}
	public Set<String> getSets() {
		return sets;
	}
	public void setSets(Set<String> sets) {
		this.sets = sets;
	}
	public Map<Integer, String> getMaps() {
		return maps;
	}
	public void setMaps(Map<Integer, String> maps) {
		this.maps = maps;
	}
	public Properties getPros() {
		return pros;
	}
	public void setPros(Properties pros) {
		this.pros = pros;
	}
	public void prt(){
		for(String l:lists){
			System.out.println(l);
		}
		for(String s:arrays){
			System.out.println(s);
		}
		for(String s:sets){
			System.out.println(s);
		}
		System.out.println(maps);
		System.out.println(pros);
	}
	
}
