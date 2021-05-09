package Entities;

public class Campaign {
	
	public int id;
	public String campaignName;
	public Double discountPrice;
	public Campaign(int id, String campaignName, Double discountPrice) {
		super();
		this.id = id;
		this.campaignName = campaignName;
		this.discountPrice = discountPrice;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCampaignName() {
		return campaignName;
	}
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
	public Double getDiscountPrice() {
		return discountPrice;
	}
	public void setDiscountPrice(Double discountPrice) {
		this.discountPrice = discountPrice;
	}

}
