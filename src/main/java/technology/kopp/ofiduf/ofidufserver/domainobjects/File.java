package technology.kopp.ofiduf.ofidufserver.domainobjects;

import java.nio.file.Path;
import java.nio.file.attribute.FileTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.nio.file.attribute.FileTime;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class File {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	// same files get the same dupeId
	// size equals and modificationTime equals and nam equales
	// or
	// content equals
	private UniqueFile uniqueFile;

	private Path path;

	private String name;

	private Directory directory;

	private Long size;

	private FileTime modificationTime;

}
