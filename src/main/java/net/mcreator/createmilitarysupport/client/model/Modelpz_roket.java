package net.mcreator.createmilitarysupport.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelpz_roket<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("createmilitary_support", "modelpz_roket"), "main");
	public final ModelPart rocket;

	public Modelpz_roket(ModelPart root) {
		this.rocket = root.getChild("rocket");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition rocket = partdefinition.addOrReplaceChild("rocket",
				CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, 1.0F, -7.0F, 6.0F, 4.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(0, 17).addBox(-4.0F, -1.0F, -10.0F, 10.0F, 8.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(25, 0)
						.addBox(-3.0F, 0.0F, -8.0F, 7.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(31, 29).addBox(0.0F, -4.0F, 2.0F, 2.0F, 14.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 20.0F, 3.0F, 0.0F, 1.5708F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		rocket.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
