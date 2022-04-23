package andromo.odiabook.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TextView {
    @SerializedName("ns")
    @Expose

    private List<TextModel> spllist;


    public List<TextModel> getText(){
        return spllist;
    }

    public void setAlbums(List<TextModel> spllist){
        this.spllist = spllist;
    }
}
