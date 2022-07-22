
public class VideoRVAdapter extends RecyclerView.Adapter<VideoRVAdapter.ViewHolder> {

    private ArrayList<VideoRVModal> videoRVModalArrayList;
    private Context context;
    private VideoClickInterface videoClickInterface;

    public VideoRVAdapter(ArrayList<VideoRVModal> videoRVModalArrayList, Context context, VideoClickInterface videoClickInterface) {
        this.videoRVModalArrayList = videoRVModalArrayList;
        this.context = context;
        this.videoClickInterface = videoClickInterface;
    }

    @Override
    public VideoRVAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.video_rv_item,parent,false);
       return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VideoRVAdapter.ViewHolder holder,int pos) {

        VideoRVModal videoRVModal = videoRVModalArrayList.get(pos);
        holder.thumbnailIV.setImageBitmap(videoRVModal.getVideoThumbnail());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                videoClickInterface.OnVideoClick(pos);
            }
        });
    }

    @Override
    public int getItemCount() {
        return videoRVModalArrayList.size();
    }
    public interface VideoClickInterface{
        void OnVideoClick(int position);
    }
    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView thumbnailIV;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            thumbnailIV = itemView.findViewById(R.id.idIVThumbnail);
        }
    }

}
