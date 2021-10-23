package com.raisjayadevelop.listapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class emyuAdapter extends BaseAdapter {

    Context context;
    String[] players;
    String[] positions;
    int[] number;
    LayoutInflater inflater;

    public emyuAdapter(Context context, String[] players, String[] positions, int[] number) {
        this.context = context;
        this.players = players;
        this.positions = positions;
        this.number = number;
        this.inflater = (LayoutInflater.from(context));
    }

    @Override
    public int getCount() {
        return players.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View v, ViewGroup parent) {
        v = inflater.inflate(R.layout.list_players, null);
        TextView tvPlayers = (TextView) v.findViewById(R.id.tv_player);
        TextView tvPosition = (TextView) v.findViewById(R.id.tv_pos);
        TextView tvNumber= (TextView) v.findViewById(R.id.tv_number);

        tvPlayers.setText(players[i]);
        tvPosition.setText(positions[i]);
        tvNumber.setText(number[i]+"");

        return null;
    }
}
