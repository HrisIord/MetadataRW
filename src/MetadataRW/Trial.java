package MetadataRW;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import org.jaudiotagger.audio.*;
import org.jaudiotagger.audio.exceptions.CannotReadException;
import org.jaudiotagger.audio.exceptions.CannotWriteException;
import org.jaudiotagger.audio.exceptions.InvalidAudioFrameException;
import org.jaudiotagger.audio.exceptions.ReadOnlyFileException;
import org.jaudiotagger.tag.*;

public class Trial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileLocation = "C:\\Users\\Hristina\\Music\\ZE-A Phoenix.mp3";
		
		try {
			AudioFile f = AudioFileIO.read(new File(fileLocation));
			Tag tag = f.getTag();
			AudioHeader a = f.getAudioHeader();
			
			Iterator<TagField> iterator = tag.getFields();
			while(iterator.hasNext()) {
			    System.out.println(iterator.next());
			}
			
			System.out.println(tag.getFirst(FieldKey.ARTIST) + "\n" +
			tag.getFirst(FieldKey.ALBUM) + "\n" +
			tag.getFirst(FieldKey.TITLE) + "\n" +
			tag.getFirst(FieldKey.COMMENT) + "\n" +
			tag.getFirst(FieldKey.YEAR) + "\n" +
			tag.getFirst(FieldKey.TRACK) + "\n" +
			tag.getFirst(FieldKey.DISC_NO) + "\n" +
			tag.getFirst(FieldKey.COMPOSER) + "\n" +
			tag.getFirst(FieldKey.ARTIST_SORT));
			
			tag.setField(FieldKey.COMMENT,"Like a PHOENIX! Getcha with the FIRE BIRD!");
			f.commit();
			
		} catch (CannotReadException | IOException | TagException
				| ReadOnlyFileException | InvalidAudioFrameException 
				| CannotWriteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
