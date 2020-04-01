package fi.tucs.entities;

import com.google.common.collect.Iterables;
import fi.tucs.entities.entities.Entity;
import fi.tucs.entities.entities.Field;
import java.util.LinkedHashSet;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class EntitiesModelUtils {
  public LinkedHashSet<Entity> classHierarchy(final Entity c) {
    LinkedHashSet<Entity> _xblockexpression = null;
    {
      final LinkedHashSet<Entity> visited = CollectionLiterals.<Entity>newLinkedHashSet();
      Entity current = c.getSuperType();
      while (((current != null) && (!visited.contains(current)))) {
        {
          visited.add(current);
          current = current.getSuperType();
        }
      }
      _xblockexpression = visited;
    }
    return _xblockexpression;
  }
  
  public Iterable<Field> classHierarchyMembers(final Entity c) {
    final Function1<Entity, EList<Field>> _function = (Entity it) -> {
      return it.getFields();
    };
    return Iterables.<Field>concat(IterableExtensions.<Entity, EList<Field>>map(this.classHierarchy(c), _function));
  }
}
