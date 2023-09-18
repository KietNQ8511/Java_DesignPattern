package composite;

import java.util.Arrays;
import java.util.List;

public class FolderComposite implements FileComponent {

	private List<FileComponent> files;
	
	public FolderComposite(List<FileComponent> files) {
		// TODO Auto-generated constructor stub
		this.files = files;
	}

	@Override
	public void showProperty() {
		// TODO Auto-generated method stub
		for (FileComponent fileComponent : files) {
			fileComponent.showProperty();
		}
	}

	@Override
	public long totalSize() {
		// TODO Auto-generated method stub
		long total = 0;
		for (FileComponent fileComponent : files) {
			total += fileComponent.totalSize();
		}
		return total;
	}

	public static void main(String[] args) {
		FileComponent file1 = new FileLeaf("file 1", 10);
		FileComponent file2 = new FileLeaf("file 2", 15);
		
		List<FileComponent> fileList = Arrays.asList(file1, file2);
		FolderComposite folder = new FolderComposite(fileList);
		folder.showProperty();
		System.out.println(folder.totalSize());
	}
}
