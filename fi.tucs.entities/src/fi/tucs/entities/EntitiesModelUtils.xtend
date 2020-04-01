package fi.tucs.entities

import fi.tucs.entities.entities.Entity

class EntitiesModelUtils {

	def classHierarchy(Entity c) {
		val visited = newLinkedHashSet()
		
		var current = c.superType
		while (current !== null && !visited.contains(current)) {
			visited.add(current)
			current = current.superType
		}	 
		
		visited
	}
	
	def classHierarchyMembers(Entity c) {
		c.classHierarchy.map[fields].flatten
	}

}