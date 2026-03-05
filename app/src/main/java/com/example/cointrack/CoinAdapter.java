package com.example.cointrack;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class CoinAdapter extends RecyclerView.Adapter<CoinAdapter.CoinViewHolder> {

    private List<Coin> coinList;

    public CoinAdapter(List<Coin> coinList) {
        this.coinList = coinList;
    }

    @NonNull
    @Override
    public CoinViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.coin_item, parent, false);
        return new CoinViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CoinViewHolder holder, int position) {
        Coin coin = coinList.get(position);
        holder.nameText.setText(coin.getName() + " (" + coin.getSymbol() + ")");
        holder.priceText.setText(String.format("$%,.2f", coin.getCurrentPrice()));
    }

    @Override
    public int getItemCount() {
        return coinList.size();
    }

    static class CoinViewHolder extends RecyclerView.ViewHolder {
        TextView nameText, priceText;
        public CoinViewHolder(@NonNull View itemView) {
            super(itemView);
            nameText = itemView.findViewById(R.id.textCoinName);
            priceText = itemView.findViewById(R.id.textCoinPrice);
        }
    }
}