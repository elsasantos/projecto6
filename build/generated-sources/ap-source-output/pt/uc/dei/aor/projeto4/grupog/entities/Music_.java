package pt.uc.dei.aor.projeto4.grupog.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import pt.uc.dei.aor.projeto4.grupog.entities.AppUser;
import pt.uc.dei.aor.projeto4.grupog.entities.Playlist;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-03-28T17:55:39")
@StaticMetamodel(Music.class)
public class Music_ { 

    public static volatile SingularAttribute<Music, String> title;
    public static volatile SingularAttribute<Music, Integer> music_year;
    public static volatile SingularAttribute<Music, Integer> music_id;
    public static volatile SingularAttribute<Music, String> album;
    public static volatile SingularAttribute<Music, String> artist;
    public static volatile SingularAttribute<Music, String> music_path;
    public static volatile ListAttribute<Music, Playlist> playlists;
    public static volatile SingularAttribute<Music, AppUser> user;

}