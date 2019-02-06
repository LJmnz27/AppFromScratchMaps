package org.pursuit.appfromscratchmaps.models;

import java.util.List;

public class MuseumWrapper {
	private List<Museum> museums;

	public void setMuseums(List<Museum> museums){
		this.museums = museums;
	}

	public List<Museum> getMuseums(){
		return museums;
	}
}