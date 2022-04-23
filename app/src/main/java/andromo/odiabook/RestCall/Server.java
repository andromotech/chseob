package andromo.odiabook.RestCall;
import andromo.odiabook.model.TextView;
import retrofit2.Call;
import retrofit2.http.GET;

public interface Server {
    @GET("o/json%2Fchseo.json?alt=media&token=e906d067-181d-4274-be2f-504909b9c106")
    Call<TextView> getText();
}

