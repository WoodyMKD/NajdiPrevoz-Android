package android.najdiprevoz.ui.fragments;

import android.najdiprevoz.R;
import android.najdiprevoz.ui.models.Post;
import android.najdiprevoz.ui.models.appTrips;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.fragment.NavHostFragment;

import java.util.List;

//import retrofit2.Call;
//import retrofit2.Callback;
//import retrofit2.Response;
//import retrofit2.Retrofit;
//import retrofit2.converter.gson.GsonConverterFactory;

public class FirstFragment extends Fragment {


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



    }


    private TextView textViewResult;
    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        View v = inflater.inflate(R.layout.fragment_first, container, false);


        Bundle bundle = this.getArguments();

// !!!!!!!!!!!!!!!!!!!!!!!!!!! smeni go baseurl posle
        // the keys bruh, podolu so retrofit zemi i pastiraj vo lista samo i gg wp
        bundle.getString("from");
        bundle.getString("to");

//        textViewResult = v.findViewById(R.id.text);
//        Retrofit retrofit = new Retrofit.Builder()
//                .baseUrl("https://jsonplaceholder.typicode.com/")
//                .addConverterFactory(GsonConverterFactory.create())
//                .build();
//        tripsApi tripsApi = retrofit.create(tripsApi.class);
//        Call<List<Post>> call = tripsApi.getPosts();
//        call.enqueue(new Callback<List<Post>>() {
//            @Override
//            public void onResponse(Call<List<Post>> call, Response<List<Post>> response) {
//                if(!response.isSuccessful()){
//                    textViewResult.setText("Code: "+response.code());
//                    return;
//                }
//                List<Post> posts = response.body();
//                for (Post post : posts){
//                    String content = "";
//                    content+="ID: "+post.getId()+"\n";
//                    content+="Title: "+post.getTitle()+"\n\n";
//                    textViewResult.append(content);
//                }
//            }
//
//            @Override
//            public void onFailure(Call<List<Post>> call, Throwable t) {
//                textViewResult.setText(t.getMessage());
//            }
//        });


        return v;
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }
}