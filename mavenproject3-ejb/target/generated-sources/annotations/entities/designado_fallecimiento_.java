package entities;

import entities.pensionado;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-05-14T00:53:22")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-05-13T23:48:29")
>>>>>>> refs/remotes/origin/master
@StaticMetamodel(designado_fallecimiento.class)
public class designado_fallecimiento_ { 

    public static volatile SingularAttribute<designado_fallecimiento, String> apellido_designado;
    public static volatile SingularAttribute<designado_fallecimiento, String> nombre_designado;
    public static volatile SingularAttribute<designado_fallecimiento, Long> rut_designado;
    public static volatile SingularAttribute<designado_fallecimiento, String> parentesco;
    public static volatile SingularAttribute<designado_fallecimiento, Long> id;
    public static volatile SingularAttribute<designado_fallecimiento, Long> telefono;
    public static volatile SingularAttribute<designado_fallecimiento, pensionado> pensionados;

}