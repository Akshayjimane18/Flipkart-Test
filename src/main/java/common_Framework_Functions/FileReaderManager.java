package common_Framework_Functions;

public class FileReaderManager {
	private static FileReaderManager fileReaderManager = new FileReaderManager();
	private static GetPropertyValue configFileReader;

	private FileReaderManager() {
	}

	public static FileReaderManager getInstance() {
		return fileReaderManager;
	}

	public GetPropertyValue getConfigReader() {
		return (configFileReader == null) ? new GetPropertyValue() : configFileReader;
	}

}
