package pt.uc.dei.aor.projeto4.grupog.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import pt.uc.dei.aor.projeto4.grupog.entities.Music;
import pt.uc.dei.aor.projeto4.grupog.entities.Playlist;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-04-28T13:06:31")
@StaticMetamodel(AppUser.class)
public class AppUser_ { 

    public static volatile ListAttribute<AppUser, Music> musics;
    public static volatile SingularAttribute<AppUser, String> email;
    public static volatile SingularAttribute<AppUser, String> name;
    public static volatile SingularAttribute<AppUser, Integer> user_id;
    public static volatile ListAttribute<AppUser, Playlist> playlists;
    public static volatile SingularAttribute<AppUser, String> password;

}