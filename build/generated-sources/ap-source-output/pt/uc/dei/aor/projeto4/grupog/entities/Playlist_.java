package pt.uc.dei.aor.projeto4.grupog.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import pt.uc.dei.aor.projeto4.grupog.entities.AppUser;
import pt.uc.dei.aor.projeto4.grupog.entities.Music;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-03-28T17:55:39")
@StaticMetamodel(Playlist.class)
public class Playlist_ { 

    public static volatile SingularAttribute<Playlist, Integer> id;
    public static volatile ListAttribute<Playlist, Music> musics;
    public static volatile SingularAttribute<Playlist, Date> creationDate;
    public static volatile SingularAttribute<Playlist, String> name;
    public static volatile SingularAttribute<Playlist, AppUser> user;
    public static volatile SingularAttribute<Playlist, Integer> size;

}