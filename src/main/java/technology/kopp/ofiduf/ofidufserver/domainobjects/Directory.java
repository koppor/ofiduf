package technology.kopp.ofiduf.ofidufserver.domainobjects;

import java.nio.file.Path;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import lombok.Getter;
import lombok.Setter;

@Entity
public class Directory {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

    @Getter
    @Setter
    private String path;

    @Transient
    @Getter(lazy = true)
    private final Path pathAsPath;

    private Set<Directory> subDirectories;

	private int level;

	private Set<File> files();

	private Set<File> recursiveFiles();

	private Set<UniqueFile> recursiveUniqueFiles();

	// private Category category;

}
