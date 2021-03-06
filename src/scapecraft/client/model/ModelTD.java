package scapecraft.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelTD extends ModelBase
{
	//fields
	ModelRenderer bone_chin1;
	ModelRenderer bone_chin2;
	ModelRenderer chest;
	ModelRenderer chest_2;
	ModelRenderer chestbone1;
	ModelRenderer chestbone2;
	ModelRenderer chestbone3;
	ModelRenderer chestbone4;
	ModelRenderer chestbone5;
	ModelRenderer chestbone6;
	ModelRenderer claw_1_1;
	ModelRenderer claw_1_2;
	ModelRenderer claw_2_1;
	ModelRenderer claw_2_2;
	ModelRenderer fist1;
	ModelRenderer fist2;
	ModelRenderer food_pad_2;
	ModelRenderer foot_pad1;
	ModelRenderer fore_arm1;
	ModelRenderer fore_arm2;
	ModelRenderer head;
	ModelRenderer horn_1;
	ModelRenderer horn_2;
	ModelRenderer horn_3;
	ModelRenderer horn_4;
	ModelRenderer horn_5;
	ModelRenderer horn_6;
	ModelRenderer shoulder1;
	ModelRenderer shoulder2;
	ModelRenderer shoulderpad1;
	ModelRenderer shoulderpad2;
	ModelRenderer upper_chin_part_1;
	ModelRenderer upper_chin_part_2;
	ModelRenderer upper_leg_part1;
	ModelRenderer upper_leg_part2;
	ModelRenderer waist;

	public ModelTD()
	{
		textureWidth = 256;
		textureHeight = 128;

		foot_pad1 = new ModelRenderer(this, 0, 23);
		foot_pad1.addBox(0F, 0F, 0F, 7, 2, 7);
		foot_pad1.setRotationPoint(-10F, 22F, 0F);
		foot_pad1.setTextureSize(256, 128);
		food_pad_2 = new ModelRenderer(this, 0, 23);
		food_pad_2.addBox(0F, 0F, 0F, 7, 2, 7);
		food_pad_2.setRotationPoint(0F, 22F, 0F);
		food_pad_2.setTextureSize(256, 128);
		bone_chin1 = new ModelRenderer(this, 57, 37);
		bone_chin1.addBox(0F, 0F, 0F, 3, 11, 3);
		bone_chin1.setRotationPoint(-8F, 12F, 7F);
		bone_chin1.setTextureSize(256, 128);
		setRotation(bone_chin1, -0.3490659F, 0F, 0.0174533F);
		bone_chin2 = new ModelRenderer(this, 57, 37);
		bone_chin2.addBox(0F, 0F, 0F, 3, 11, 3);
		bone_chin2.setRotationPoint(2F, 12F, 7F);
		bone_chin2.setTextureSize(256, 128);
		setRotation(bone_chin2, -0.3490659F, 0F, 0.0174533F);
		upper_chin_part_1 = new ModelRenderer(this, 71, 37);
		upper_chin_part_1.addBox(0F, 0F, 0F, 5, 12, 5);
		upper_chin_part_1.setRotationPoint(-9F, 6F, -1F);
		upper_chin_part_1.setTextureSize(256, 128);
		setRotation(upper_chin_part_1, 0.6981317F, 0F, 0F);
		upper_chin_part_2 = new ModelRenderer(this, 71, 37);
		upper_chin_part_2.addBox(0F, 0F, 0F, 5, 12, 5);
		upper_chin_part_2.setRotationPoint(1F, 6F, -1F);
		upper_chin_part_2.setTextureSize(256, 128);
		setRotation(upper_chin_part_2, 0.6981317F, 0F, 0F);
		upper_leg_part1 = new ModelRenderer(this, 71, 37);
		upper_leg_part1.addBox(0F, 0F, 0F, 5, 11, 5);
		upper_leg_part1.setRotationPoint(-9F, -5F, 2F);
		upper_leg_part1.setTextureSize(256, 128);
		setRotation(upper_leg_part1, -0.2617994F, 0F, 0F);
		upper_leg_part2 = new ModelRenderer(this, 71, 37);
		upper_leg_part2.addBox(0F, 0F, 0F, 5, 11, 5);
		upper_leg_part2.setRotationPoint(1F, -5F, 2F);
		upper_leg_part2.setTextureSize(256, 128);
		setRotation(upper_leg_part2, -0.2617994F, 0F, 0F);
		chest_2 = new ModelRenderer(this, 0, 62);
		chest_2.addBox(0F, 0F, 0F, 13, 5, 14);
		chest_2.setRotationPoint(-13F, -21F, -2F);
		chest_2.setTextureSize(256, 128);
		setRotation(chest_2, 0F, 0F, -0.3490659F);
		waist = new ModelRenderer(this, 0, 89);
		waist.addBox(0F, 0F, 0F, 15, 17, 10);
		waist.setRotationPoint(-9F, -21F, 0F);
		waist.setTextureSize(256, 128);
		chestbone1 = new ModelRenderer(this, 55, 105);
		chestbone1.addBox(0F, 0F, 0F, 2, 6, 2);
		chestbone1.setRotationPoint(-2.5F, -21F, -2F);
		chestbone1.setTextureSize(256, 128);
		chestbone2 = new ModelRenderer(this, 0, 0);
		chestbone2.addBox(0F, 0F, 0F, 17, 2, 11);
		chestbone2.setRotationPoint(-10F, -13F, 0F);
		chestbone2.setTextureSize(256, 128);
		chestbone3 = new ModelRenderer(this, 52, 101);
		chestbone3.addBox(0F, 0F, 0F, 7, 2, 12);
		chestbone3.setRotationPoint(-10F, -13F, -1F);
		chestbone3.setTextureSize(256, 128);
		shoulderpad2 = new ModelRenderer(this, 59, 0);
		shoulderpad2.addBox(0F, 0F, 0F, 12, 8, 10);
		shoulderpad2.setRotationPoint(-25F, -32.5F, 0F);
		shoulderpad2.setTextureSize(256, 128);
		chestbone4 = new ModelRenderer(this, 52, 102);
		chestbone4.addBox(0F, 0F, 0F, 17, 2, 12);
		chestbone4.setRotationPoint(-10F, -17F, -1F);
		chestbone4.setTextureSize(256, 128);
		chestbone5 = new ModelRenderer(this, 52, 102);
		chestbone5.addBox(0F, 0F, 0F, 8, 2, 12);
		chestbone5.setRotationPoint(-1F, -21F, -1F);
		chestbone5.setTextureSize(256, 128);
		chestbone6 = new ModelRenderer(this, 55, 102);
		chestbone6.addBox(0F, 0F, 0F, 7, 2, 12);
		chestbone6.setRotationPoint(0F, -13F, -1F);
		chestbone6.setTextureSize(256, 128);
		horn_3 = new ModelRenderer(this, 31, 19);
		horn_3.addBox(-3F, 0F, 0F, 5, 2, 2);
		horn_3.setRotationPoint(-17F, -45F, 1F);
		horn_3.setTextureSize(256, 128);
		setRotation(horn_3, 0F, -0.3490659F, 0F);
		claw_2_2 = new ModelRenderer(this, 76, 56);
		claw_2_2.addBox(0F, 16F, 4F, 2, 10, 3);
		claw_2_2.setRotationPoint(-22F, -16.5F, 1F);
		claw_2_2.setTextureSize(256, 128);
		setRotation(claw_2_2, -0.3490659F, 0F, 0F);
		shoulderpad1 = new ModelRenderer(this, 59, 0);
		shoulderpad1.addBox(0F, 0F, 0F, 12, 8, 10);
		shoulderpad1.setRotationPoint(10F, -32.5F, 0F);
		shoulderpad1.setTextureSize(256, 128);
		shoulder2 = new ModelRenderer(this, 0, 0);
		shoulder2.addBox(0F, 0F, 0F, 7, 10, 7);
		shoulder2.setRotationPoint(-20F, -24.5F, 1F);
		shoulder2.setTextureSize(256, 128);
		fore_arm2 = new ModelRenderer(this, 0, 0);
		fore_arm2.addBox(0F, 0F, 0F, 7, 13, 7);
		fore_arm2.setRotationPoint(-20F, -16.5F, 1F);
		fore_arm2.setTextureSize(256, 128);
		setRotation(fore_arm2, -0.3490659F, 0F, 0F);
		fist2 = new ModelRenderer(this, 59, 19);
		fist2.addBox(0F, 11F, -1F, 8, 9, 8);
		fist2.setRotationPoint(-21F, -16.5F, 1F);
		fist2.setTextureSize(256, 128);
		setRotation(fist2, -0.3490659F, 0F, 0F);
		claw_1_2 = new ModelRenderer(this, 77, 57);
		claw_1_2.addBox(0F, 16F, -1F, 2, 10, 3);
		claw_1_2.setRotationPoint(-22F, -16.5F, 1F);
		claw_1_2.setTextureSize(256, 128);
		setRotation(claw_1_2, -0.3490659F, 0F, 0F);
		shoulder1 = new ModelRenderer(this, 0, 0);
		shoulder1.addBox(0F, 0F, 0F, 7, 10, 7);
		shoulder1.setRotationPoint(10F, -24.5F, 1F);
		shoulder1.setTextureSize(256, 128);
		fore_arm1 = new ModelRenderer(this, 0, 0);
		fore_arm1.addBox(0F, 0F, 0F, 7, 13, 7);
		fore_arm1.setRotationPoint(10F, -16.5F, 1F);
		fore_arm1.setTextureSize(256, 128);
		setRotation(fore_arm1, -0.3490659F, 0F, 0F);
		fist1 = new ModelRenderer(this, 59, 19);
		fist1.addBox(0F, 11F, -1F, 8, 9, 8);
		fist1.setRotationPoint(10F, -16.5F, 1F);
		fist1.setTextureSize(256, 128);
		setRotation(fist1, -0.3490659F, 0F, 0F);
		claw_1_1 = new ModelRenderer(this, 76, 58);
		claw_1_1.addBox(0F, 16F, -1F, 2, 10, 3);
		claw_1_1.setRotationPoint(17F, -16.5F, 1F);
		claw_1_1.setTextureSize(256, 128);
		setRotation(claw_1_1, -0.3490659F, 0F, 0F);
		claw_2_1 = new ModelRenderer(this, 77, 57);
		claw_2_1.addBox(0F, 16F, 4F, 2, 10, 3);
		claw_2_1.setRotationPoint(17F, -16.5F, 1F);
		claw_2_1.setTextureSize(256, 128);
		setRotation(claw_2_1, -0.3490659F, 0F, 0F);
		chest = new ModelRenderer(this, 0, 62);
		chest.addBox(0F, 0F, 0F, 23, 12, 14);
		chest.setRotationPoint(-13F, -33F, -2F);
		chest.setTextureSize(256, 128);
		head = new ModelRenderer(this, 0, 33);
		head.addBox(0F, 0F, 0F, 16, 14, 13);
		head.setRotationPoint(-9.5F, -47F, -2F);
		head.setTextureSize(256, 128);
		horn_5 = new ModelRenderer(this, 29, 20);
		horn_5.addBox(3F, 0F, 1F, 5, 2, 2);
		horn_5.setRotationPoint(10F, -45F, 1F);
		horn_5.setTextureSize(256, 128);
		setRotation(horn_5, 0F, 0.3490659F, 0F);
		horn_2 = new ModelRenderer(this, 30, 20);
		horn_2.addBox(0F, 0F, 0F, 5, 3, 3);
		horn_2.setRotationPoint(-17F, -45F, 1F);
		horn_2.setTextureSize(256, 128);
		setRotation(horn_2, 0F, -0.1396263F, 0F);
		horn_1 = new ModelRenderer(this, 29, 19);
		horn_1.addBox(0F, 0F, 0F, 5, 4, 4);
		horn_1.setRotationPoint(-13F, -45F, 1F);
		horn_1.setTextureSize(256, 128);
		horn_4 = new ModelRenderer(this, 29, 19);
		horn_4.addBox(0F, 0F, 0F, 5, 4, 4);
		horn_4.setRotationPoint(6F, -45F, 1F);
		horn_4.setTextureSize(256, 128);
		horn_6 = new ModelRenderer(this, 31, 19);
		horn_6.addBox(0F, 0F, 0F, 5, 3, 3);
		horn_6.setRotationPoint(10F, -45F, 1F);
		horn_6.setTextureSize(256, 128);
		setRotation(horn_5, 0F, 0.1396263F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		foot_pad1.render(f5);
		food_pad_2.render(f5);
		bone_chin1.render(f5);
		bone_chin2.render(f5);
		upper_chin_part_1.render(f5);
		upper_chin_part_2.render(f5);
		upper_leg_part1.render(f5);
		upper_leg_part2.render(f5);
		chest_2.render(f5);
		waist.render(f5);
		chestbone1.render(f5);
		chestbone2.render(f5);
		chestbone3.render(f5);
		shoulderpad2.render(f5);
		chestbone4.render(f5);
		chestbone5.render(f5);
		chestbone6.render(f5);
		horn_3.render(f5);
		claw_2_2.render(f5);
		shoulderpad1.render(f5);
		shoulder2.render(f5);
		fore_arm2.render(f5);
		fist2.render(f5);
		claw_1_2.render(f5);
		shoulder1.render(f5);
		fore_arm1.render(f5);
		fist1.render(f5);
		claw_1_1.render(f5);
		claw_2_1.render(f5);
		chest.render(f5);
		head.render(f5);
		horn_5.render(f5);
		horn_2.render(f5);
		horn_1.render(f5);
		horn_4.render(f5);
		horn_5.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}
}
