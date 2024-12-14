package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class LetterAdapter extends RecyclerView.Adapter<LetterAdapter.LetterViewHolder> {

    private List<String> letterList;
    private Context context;

    public LetterAdapter(List<String> letterList, Context context) {
        this.letterList = letterList;
        this.context = context;
    }

    @NonNull
    @Override
    public LetterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_letter, parent, false);
        return new LetterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LetterViewHolder holder, int position) {
        String letter = letterList.get(position);
        holder.textViewLetter.setText(letter);
    }

    @Override
    public int getItemCount() {
        return letterList.size();
    }

    public class LetterViewHolder extends RecyclerView.ViewHolder {
        public TextView textViewLetter;

        public LetterViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewLetter = itemView.findViewById(R.id.textViewLetter);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getAdapterPosition();
                    if (position != RecyclerView.NO_POSITION) {
                        String letter = letterList.get(position);
                        Intent intent = getIntentForLetter(letter);
                        context.startActivity(intent);
                    }
                }
            });
        }
    }

    private Intent getIntentForLetter(String letter) {
        switch (letter) {
            case "А":
                return new Intent(context, LetterA.class);
            case "Б":
                return new Intent(context, LetterB.class);
            case "В":
                return new Intent(context, LetterV.class);
            case "Г":
                return new Intent(context, LetterG.class);
            case "Д":
                return new Intent(context, LetterD.class);
            case "Е":
                return new Intent(context, LetterE.class);
            case "Ж":
                return new Intent(context, LetterJ.class);
            case "З":
                return new Intent(context, LetterZ.class);
            case "И":
                return new Intent(context, LetterI.class);
            case "Й":
                return new Intent(context, LetterIY.class);
            case "К":
                return new Intent(context, LetterK.class);
            case "Л":
                return new Intent(context, LetterL.class);
            case "М":
                return new Intent(context, LetterM.class);
            case "Н":
                return new Intent(context, LetterN.class);
            case "О":
                return new Intent(context, LetterO.class);
            case "П":
                return new Intent(context, LetterP.class);
            case "Р":
                return new Intent(context, LetterR.class);
            case "С":
                return new Intent(context, LetterS.class);
            case "Т":
                return new Intent(context, LetterT.class);
            case "У":
                return new Intent(context, LetterY.class);
            case "Ф":
                return new Intent(context, LetterF.class);
            case "Х":
                return new Intent(context, LetterX.class);
            case "Ц":
                return new Intent(context, LetterC.class);
            case "Ч":
                return new Intent(context, LetterChe.class);
            case "Ш":
                return new Intent(context, LetterSha.class);
            case "Щ":
                return new Intent(context, LetterShh.class);
            case "Ы":
                return new Intent(context, LetterNenado.class);
            case "Ь":
                return new Intent(context, LetterTomyagkiyznak.class);
            case "Э":
                return new Intent(context, LetterEleroniki.class);
            case "Ю":
                return new Intent(context, LetterU.class);
            case "Я":
                return new Intent(context, LetterYuh.class);
            default:
                return new Intent(context, LetterA.class);
        }
    }
}