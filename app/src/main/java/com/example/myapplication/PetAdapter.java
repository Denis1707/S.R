package com.example.myapplication;



import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class PetAdapter extends RecyclerView.Adapter<PetAdapter.ViewHolder> {

    private List<Pet> petList;
    private Context context;

    public PetAdapter(Context context, List<Pet> petList) {
        this.context = context;
        this.petList = petList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_main, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Pet pet = petList.get(position);
        holder.petName.setText(pet.getName());
        holder.petBreed.setText(pet.getBreed());
        holder.petImage.setImageResource(pet.getImageResourceId());
    }

    @Override
    public int getItemCount() {
        return petList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView petImage;
        TextView petName;
        TextView petBreed;

        ViewHolder(View view) {
            super(view);
            petImage = view.findViewById(R.id.imageViewPet);
            petName = view.findViewById(R.id.textViewPetName);
            petBreed = view.findViewById(R.id.textViewPetBreed);
        }
    }
}
