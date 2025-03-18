package semantic.symboltable;

import ast.program.Definition;

import java.util.*;

public class SymbolTable {
	
	private int scope=0;
	private List<Map<String, Definition>> table;
	public SymbolTable()  {
		this.table = new LinkedList<>();
		Map<String, Definition> global = new HashMap<>();
		this.table.add(global);
	}

	public void set() {
		Map<String, Definition> local = new HashMap<>();
		scope++;
		this.table.add(local);
	}
	
	public void reset() {
		this.table.remove(this.scope);
		scope--;
	}
	
	public boolean insert(Definition definition) {
		Map<String, Definition> local = this.table.get(this.scope);
		definition.setScope(this.scope);
		if(!local.containsKey(definition.getName())) {
			local.put(definition.getName(), definition);
			return true;
		}

		return false;
	}
	
	public Definition find(String id) {
		for(int i= table.size()-1; i>=0; i--) {
			Map<String, Definition> local = table.get(i);
			if(local.containsKey(id)) {
				return local.get(id);
			}
		}
		return null;
	}

	public Definition findInCurrentScope(String id) {
		Map<String, Definition> local = this.table.get(this.scope);
		return local.get(id);
	}
}
