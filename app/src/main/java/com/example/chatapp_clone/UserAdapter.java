package com.example.chatapp_clone;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.chatapp_clone.databinding.LookBinding;

import java.util.ArrayList;


public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder>{

    Context context;
    ArrayList<Users> users;

    public UserAdapter(Context context,UserAdapter<Users> users){
        this.context = context;
        this.users= users;

    }
    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.look, parent,false);

        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
    Users user = users.get(position);
    holder.lookBinding.users.setText(user.getName());
    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    public class UserViewHolder extends RecyclerView.ViewHolder{

        LookBinding lookBinding;

        public UserViewHolder(@NonNull View itemView) {
            super(itemView);
            lookBinding =LookBinding.bind(itemView);

        }
    }

}
